from django import template
register = template.Library()

@register.filter(name='get_field')
def get_field(object, field):
    if hasattr(object, field):
        return getattr(object, field)
    return ''