##############################################################
### The version below is WITH inlining admin interfaces ###
##############################################################
# from django.contrib import admin
# from .models import Question, Choice

# class ChoiceInline(admin.TabularInline):
#     model = Choice


# class QuestionAdmin(admin.ModelAdmin):
#     model = Question
#     inlines = [ ChoiceInline, ]

# admin.site.register(Question, QuestionAdmin)

##############################################################
### The version below is WITHOUT inlining admin interfaces ###
##############################################################
from django.contrib import admin
from .models import Question, Choice

admin.site.register(Question)
admin.site.register(Choice)