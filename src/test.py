def test():
    test_producto()

def test_producto():
    from apps.productos.models import Producto

    producto = Producto()
    print(producto.detail_view)