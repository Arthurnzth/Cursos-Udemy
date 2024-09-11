nome = 'Miriam Cristina Abade Nazareth'
nova_string = ''
tamanho = len(nome)
cont = 0

while cont < tamanho:
    
    if cont == tamanho - 1:
        nova_string += '*' + nome[cont] + '*'
        break
    
    nova_string += '*' + nome[cont]
    cont += 1
        
print(nova_string)