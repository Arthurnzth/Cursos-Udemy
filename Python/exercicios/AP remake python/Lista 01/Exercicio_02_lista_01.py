print('\nInforme as notas do aluno com uma casa decimal para fazer a média\n\n')
nota_1 = float(input('Digite a primeira nota: '))
nota_2 = float(input('Digite a segunda nota: '))

media = ((nota_1*3.5)+(nota_2*7.5))/(3.5+7.5)

print(f'MEDIA: {media:.1f}')