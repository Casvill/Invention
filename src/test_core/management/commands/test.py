from django.core.management.base import BaseCommand
from test import test

class Command(BaseCommand):
    def handle(self, *args, **options):
        test()