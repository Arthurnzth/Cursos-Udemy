numero = input('Digite um número inteiro: ')
int_numero = None

if numero.isdigit():
    int_numero = int(numero)
    if int_numero % 2 == 0:
        print(f'O número {numero} é par')
    else:
        print(f'O número {numero} é ímpar')
else:
    print(f'{numero} não é um número inteiro')