nome = 'Arthur Abade Nazareth'
nova_string = ''
tamanho = len(nome)
cont = 0

while cont < tamanho:
    
    nova_string += '*' + nome[cont]
    cont += 1

nova_string += '*'
print(nova_string)