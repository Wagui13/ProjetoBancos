import menus

def saqueFuncao (v_saque, saldo):
    while v_saque > saldo: # validação para o usuário não sacar um valor maior que o seu saldo
        v_saque = float(input("\t[Valor de saque maior que saldo atual!]\n\n            Tente novamente pilantra: R$").replace(',','.'))    
    while v_saque <= 0: # validação pra que o usuário não digite um numero negativo
        v_saque = menus.validaSaqueDeposito()
    saldo = saldo - v_saque
    return v_saque, saldo

def depositoFuncao (v_deposito, saldo):
    while v_deposito <= 0: # validação pra que o usuário não digite um numero negativo
        v_deposito = menus.validaSaqueDeposito()
    saldo = saldo + v_deposito
    return v_deposito, saldo

def consultaSaldoFuncao (saldo):
    return saldo

def consultaDados (data):
    return data["Nome"], data["Idade"], data["Endereco"]

def alteraDados(data):  
    while True:
        menus.limparTela()
        op = menus.alterarDadosMenu() # menu de alterações: nome, idade, endereço e senha

        if op == "1":
            newName = input(f"+{'-'*54}+\n Digite o novo nome: ")          
            menus.caixaTexto('    Nome alterado com sucesso!    ')
            data["Nome"] = newName

        elif op == "2":
            newAge = int(input(f"+{'-'*54}+\n Digite a idade: "))          
            while (newAge < 0 or newAge > 150):
                print("\t   Idade inválida! Tente novamente:") 
                newAge = int(input(f"+{'-'*54}+\n Sua idade ---------> "))
            menus.caixaTexto('   Idade alterada com sucesso!    ')
            data["Idade"] = newAge

        elif op == "3":
            newAdress = input(f"+{'-'*54}+\n Digite o seu novo endereço: ")          
            menus.caixaTexto('  Endereço alterado com sucesso!  ')
            data["Endereco"] = newAdress

        elif op == "4":
            newPsword = input(f"+{'-'*54}+\n\t     Digite sua nova senha: ")    
            while (len(newPsword) < 6):
                print("   Inválido! A senha precisa ter 6 ou mais caracteres ") 
                newPsword = input(f"+{'-'*54}+\n\t     Digite sua nova senha: ")         
            menus.caixaTexto('   Senha alterada com sucesso!    ')
                    
        elif op == "123":
            menus.caixaTexto('  [Alteração de dados encerrada]  ')
            break
        else :
            menus.caixaTexto('Operação inválida! Tente novamente')