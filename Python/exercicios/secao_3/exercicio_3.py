nome = input('Digite seu primeiro nome: ')
quantidade_letras = len(nome)

if quantidade_letras <= 4:
    print('Seu nome é curto')

elif quantidade_letras == 5 or quantidade_letras == 6:
    print('Seu nome é normal')

else:
    print('Seu nome é muito grande')