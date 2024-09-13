adicao = '[+] adição'
subtracao = '[-] subtração'
multiplicacao = '[*] multiplicação'
divisao = '[/] divisão'
operadores_permitidos = '+-*/'

while True:
    
    primeiro_numero = input('Digite o primeiro número: ')
    segundo_numero = input('Digite o segundo número: ')
    
    if primeiro_numero.find('.') <= 1 and segundo_numero.find('.') <= 1:
        primeiro_numero_teste = primeiro_numero.replace('.', '')
        segundo_numero_teste = segundo_numero.replace('.', '')
        
        if primeiro_numero_teste.isdigit() and segundo_numero_teste.isdigit():
            float_primeiro_numero = float(primeiro_numero)
            float_segundo_numero = float(segundo_numero)
            
    else:
        print('Um ou ambos números digitados inválidos.')
        continue
    
    
    print('\n' + 13 * '=' + ' MENU DE OPÇÕES ' + 13 * '=', end='\n\n')
    operador = input(f'{adicao}\t\t{subtracao}\n{multiplicacao}\t{divisao}\n\nR: ')
    
    if len(operador) > 1:
        print('Digite apenas um operador.')
        continue
        
    if operador not in operadores_permitidos:
        print('Operador inválido.')
        continue
    
    match operador:
        case '+':
            resultado = float_primeiro_numero + float_segundo_numero
            print(f'Resultado: {resultado}')
        case '-':
            resultado = float_primeiro_numero - float_segundo_numero
            print(f'Resultado: {resultado}')
        case '*':
            resultado = float_primeiro_numero * float_segundo_numero
            print(f'Resultado: {resultado}')
        case '/':
            resultado = float_primeiro_numero / float_segundo_numero
            print(f'Resultado: {resultado:.2f}')
    
    sair = input('\nDeseja sair? [s] para sim: ').lower().startswith('s')
    if sair is True:
        break