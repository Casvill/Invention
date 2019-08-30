# Generated by Django 2.2 on 2019-08-29 23:54

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('clientes', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='cliente',
            name='tipo_documento',
            field=models.CharField(blank=True, choices=[('CC', 'CC'), ('TI', 'TI'), ('NIT', 'NIT'), ('PASAPORTE', 'PASAPORTE')], max_length=20, null=True, verbose_name='Tipo de Documento'),
        ),
    ]
