from operacoesBanco import *

print("Seja Bem Vindo(a) ao Banco Blue Brasil - Casdastre seus dados e vire um participante!\n\n")

name = input("Digite o nome do usuário: ")

psword = input("Agora digite uma senha: ")
while (len(psword) < 6):
    psword = input("Inválido! A senha precisa ter 6 ou mais caracteres: ") 

age = int(input("Digite sua idade: "))

adress = input("Digite seu endereço: ")

data = {"Nome": name, "Idade": age, "Endereço": adress}
saldo = 1000.0

while True:
    print ("\n\nQual operação deseja realizar: ")
    op = input("[1] Saque, [2] Depósito, [3] Consulta de Saldo, \n[4] Consultar Dados [5] Alterar dados, [123] Sair\n-")
    if op == "1":
        v_saque = float(input("Digite o valor deseja sacar: R$"))
        while v_saque > saldo:
            v_saque = float(input("Valor de saque maior que saldo atual, tente novamente pilantra: R$"))
        print (f"Saque no valor de R${v_saque} realizado com sucesso!")
        saldo = Saque(v_saque, saldo)
    
    elif op == "2":
        v_deposito = float(input("Digite o valor deseja depositar: R$"))
        print (f"Depósito no valor de R${v_deposito} realizado com sucesso!")
        saldo = Deposito(v_deposito, saldo)
    
    elif op == "3":
        print (f"Seu saldo atual é de: R${Saldo(saldo)}")
               
    elif op == "4":
        print (f"Dados do Usuário: {ConsultaDados(data)}")
    
    elif op == "5":
        AlteraDados(data)        
    
    elif op == "123":
        input("Banco Blue Brasil - Obrigado e volte sempre!\n")
        break
    else :
        print("Operação inválida! Tente novamente:")

        