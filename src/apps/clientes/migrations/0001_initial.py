# Generated by Django 2.2 on 2019-08-15 18:53

from django.conf import settings
from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
        migrations.swappable_dependency(settings.AUTH_USER_MODEL),
    ]

    operations = [
        migrations.CreateModel(
            name='Cliente',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('is_active', models.BooleanField(default=True, verbose_name='Activo')),
                ('created_at', models.DateTimeField(auto_now_add=True, verbose_name='Fecha de creación')),
                ('updated_at', models.DateTimeField(auto_now=True, verbose_name='Fecha de Actualización')),
                ('nombres', models.CharField(blank=True, max_length=20, null=True, verbose_name='Nombres')),
                ('apellidos', models.CharField(blank=True, max_length=20, null=True, verbose_name='Apellidos')),
                ('tipo_documento', models.CharField(blank=True, choices=[('CC', 'CC'), ('TI', 'TI'), ('PASAPORTE', 'PASAPORTE')], max_length=20, null=True, verbose_name='Tipo de Documento')),
                ('identificacion', models.CharField(blank=True, max_length=20, null=True, verbose_name='Identificacion')),
                ('fecha_nacimiento', models.DateTimeField(blank=True, null=True, verbose_name='Fecha de Nacimiento')),
                ('created_by', models.ForeignKey(blank=True, null=True, on_delete=django.db.models.deletion.CASCADE, related_name='cliente_created_by', to=settings.AUTH_USER_MODEL, verbose_name='Propietario')),
                ('owner', models.ForeignKey(null=True, on_delete=django.db.models.deletion.CASCADE, related_name='cliente_owner', to=settings.AUTH_USER_MODEL, verbose_name='Propietario')),
                ('updated_by', models.ForeignKey(null=True, on_delete=django.db.models.deletion.CASCADE, related_name='cliente_updated_by', to=settings.AUTH_USER_MODEL, verbose_name='Propietario')),
            ],
            options={
                'abstract': False,
            },
        ),
    ]
