import math

print('\nInforme 3 valores para calcular as raízes da equação de Bhaskara\n\n')
valor_A = input('Digite o primeiro valor: ')
valor_B = input('Digite o segundo valor: ')
valor_C = input('Digite o terceiro valor: ')
print(f'Os valores informados foram: {valor_A}, {valor_B} e {valor_C}')

float_valor_A = float(valor_A)
float_valor_B = float(valor_B)
float_valor_C = float(valor_C)


if float_valor_A == 0:
    print('\nImpossível calcular raízes.')
else:
    delta = (float_valor_B**2)-(4*float_valor_A*float_valor_C)
    if delta < 0:
        print('\nImpossível calcular raízes.')
    else:
        raiz1 = ((float_valor_B*-1)+(math.sqrt(delta)))/(2*float_valor_A)
        raiz2 = ((float_valor_B*-1)-(math.sqrt(delta)))/(2*float_valor_A)
        if raiz1 == raiz2:
            print(f'\nA raíz é: {raiz1}')
        else:
            print(f'\nAs raízes são: {raiz1} e {raiz2}')