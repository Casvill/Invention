var base_app = angular.module('base_app', ['ngCookies', 'Alertify']);

base_app.run(function ($http, $cookies) {
    $http.defaults.headers.post['X-CSRFToken'] = $cookies.csrftoken;
});

base_app.config(function ($interpolateProvider) {
    $interpolateProvider.startSymbol('{$');
    $interpolateProvider.endSymbol('$}');
});


base_app.config(function ($httpProvider) {
    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
});

base_app.controller('OrdenGastoController', function ($scope, Alertify) {

    $scope.data = {};
    $scope.data.estamentos = [];
    $scope.data.ESPECIALIDAD_LIST = [];
    
    $scope.agregar_valor = function(estamento) {

        let respuesta_cantidad = $scope.validar_cantidad(estamento);
        let respuesta_valor = $scope.validar_valor(estamento);
        let respuesta_nota_credito = $scope.validar_nota_credito(estamento);

        if (respuesta_cantidad.error === true) {
            Alertify.alert(respuesta_cantidad.mensaje_error);
        }
        else if (respuesta_valor.error === true) {
            Alertify.alert(respuesta_valor.mensaje_error);
        }
        else if (respuesta_nota_credito.error ===  true) {
            Alertify.alert(respuesta_nota_credito.mensaje_error);
        }
        else {
            let cantidad = estamento.cantidad || 0;
            let valor = estamento.valor || 0;
            let nota_credito = estamento.nota_credito || 0;

            estamento.total_cantidad += cantidad;
            estamento.total_valor += valor;
            estamento.total_nota_credito += nota_credito;
            estamento.total += (valor + nota_credito);
            estamento.cantidad = null;
            estamento.valor = null;
            estamento.nota_credito = null;
        }

    }

    $scope.validar_cantidad = function(estamento) {
        let respuesta_cantidad = {
            'error': true,
            'mensaje_error': null,
        };

        if (typeof estamento.cantidad !== 'number') {
            respuesta_cantidad['mensaje_error'] = 'La cantidad solo acepta valores numéricos';
        }
        else if ((estamento.cantidad - Math.round(estamento.cantidad)) > 0) {
            respuesta_cantidad['mensaje_error'] = 'La cantidad debe ser entero';
        }
        else if (estamento.cantidad < 0) {
            respuesta_cantidad['mensaje_error'] = 'La cantidad no puede ser negativa';
        }
        else {
            respuesta_cantidad['error'] = false;
        }

        return respuesta_cantidad;
    }
    
    $scope.validar_valor = function(estamento) {
        let respuesta_valor = {
            'error': true,
            'mensaje_error': null,
        };

        if (typeof estamento.valor !== 'number' && typeof estamento.nota_credito !== 'number') {
            respuesta_valor['mensaje_error'] = 'El valor solo acepta valores numéricos';
        }
        else if (estamento.valor < 0) {
            respuesta_valor['mensaje_error'] = 'El valor no puede ser negativa';
        }
        else {
            respuesta_valor['error'] = false;
        }

        return respuesta_valor;
    }

    $scope.validar_nota_credito = function(estamento) {
        let respuesta_nota_credito = {
            'error': true,
            'mensaje_error': null,
        };

        if (estamento.nota_credito > 0) {
            respuesta_nota_credito['mensaje_error'] = 'La nota crédito no puede ser positiva';
        }
        else {
            respuesta_nota_credito['error'] = false;
        }

        return respuesta_nota_credito;
    }

    $scope.validar_numero_meses = function() {
        let numero_meses = $scope.data.numero_meses;

        if (typeof numero_meses === 'undefined') {
            numero_meses = 1
        }

        if (1 < numero_meses && numero_meses > 12) {
            Alertify.alert("Número de meses inválido");
            numero_meses = 1;
        }

        $scope.data.numero_meses = numero_meses;
    }

    $scope.iniciar_especialidad = function() {
        let especialidad = $scope.data.especialidad;

        if (typeof especialidad === 'undefined') {
            especialidad = $scope.data.ESPECIALIDAD_LIST[0];
        }

        $scope.data.especialidad = especialidad;
    }

});
