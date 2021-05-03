from menus import limparTela, alterarDadosMenu, opEncerrada, newName, newAdress, newAge, newPsword, opInvalida

def saqueFuncao (saque, saldo):
    return saldo - saque

def depositoFuncao (deposito, saldo):
    return saldo + deposito 

def saldoFuncao (saldo):
    return saldo

def consultaDados (data):
    return data["Nome"], data["Idade"], data["Endereco"]

def alteraDados(data):
    
    
    while True:
        limparTela()
        op = alterarDadosMenu()

        if op == "1":
            new_name = newName()
            data["Nome"] = new_name

        elif op == "2":
            new_age = newAge()
            data["Idade"] = new_age

        elif op == "3":
            new_adress = newAdress()
            data["Endereco"] = new_adress

        elif op == "4":
            psword = newPsword()
                    
        elif op == "123":
            opEncerrada()
            break

        else :
            opInvalida()