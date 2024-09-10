hora = input('Que horas são? ')
int_hora = int(hora)

if int_hora >= 0 and int_hora <= 12:
    print('Bom dia')

elif int_hora >= 12 and int_hora <= 17:
    print('Boa tarde')

elif int_hora >= 18 and int_hora <= 23:
    print('Boa noite')

else:
    print('Número inválido para horário')