def Saque (saque, saldo):
    return saldo - saque

def Deposito (deposito, saldo):
    return saldo + deposito 

def Saldo (saldo):
    return saldo

def ConsultaDados (data):
    return data

def AlteraDados(data):
    
    
    while True:
        
        print("\n\nEscolha o dado que deseja alterar ou digite 123 para sair\n")
        op = input("[1] Nome do Usuário, [2] Senha, [3] Idade, [4] Endereço, [123] Sair\n-")
        
        if op == "1":
            newName = input("Digite o novo nome: ")
            data["Nome"] = newName

        elif op == "2":
            psword = input("Digite a sua nova senha: ")
            while (len(psword) < 6):
                psword = input("Inválido! A senha precisa ter 6 ou mais caracteres: ")
        elif op == "3":
            newAge = input("Digite a idade: ")
            data["Idade"] = newAge

        elif op == "4":
            newAdress = input("Digite o seu novo endereço: ")
            data["Endereço"] = newAdress

        elif op == "123":
            print("Alteração de dados encerrado!") 
            break

        else :
            print("Operação inválida! Tente novamente:")