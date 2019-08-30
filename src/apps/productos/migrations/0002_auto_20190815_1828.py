# Generated by Django 2.2 on 2019-08-15 18:28

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('productos', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='producto',
            name='codigo',
            field=models.CharField(blank=True, max_length=10, null=True, verbose_name='Código'),
        ),
        migrations.AddField(
            model_name='producto',
            name='costo',
            field=models.FloatField(blank=True, null=True, verbose_name='Costo'),
        ),
        migrations.AddField(
            model_name='producto',
            name='descripcion',
            field=models.CharField(blank=True, max_length=100, null=True, verbose_name='Descripción'),
        ),
        migrations.AddField(
            model_name='producto',
            name='descuento',
            field=models.FloatField(blank=True, null=True, verbose_name='Descuento'),
        ),
        migrations.AddField(
            model_name='producto',
            name='iva',
            field=models.FloatField(blank=True, null=True, verbose_name='Iva'),
        ),
        migrations.AddField(
            model_name='producto',
            name='subtotal',
            field=models.FloatField(blank=True, null=True, verbose_name='Subtotal'),
        ),
        migrations.AddField(
            model_name='producto',
            name='valor_bruto',
            field=models.FloatField(blank=True, null=True, verbose_name='Valor Bruto'),
        ),
        migrations.AddField(
            model_name='producto',
            name='valor_neto',
            field=models.FloatField(blank=True, null=True, verbose_name='Valor Neto'),
        ),
    ]