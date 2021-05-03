from operacoesBanco import *
from menus import *

# mensagem de bem vindo
bemVinde()
# menu que pega os dados do usuário
name, psword, age, adress = pegarDadosMenu()
limparTela() # cls ou clear para limpar a tela

# armazenamento dos dados num dicionário
data = {"Nome": name, "Idade": age, "Endereco": adress}
saldo = 1000.0

while True:
    limparTela()
    # menu de operações: saque, deposito, saldo, dados do usuário e alteração de dados
    op = operacoesMenu()
    
    if op == "1":
        limparTela()
        v_deposito = valorDepositoMenu()
        depositoMenu(v_deposito)
        saldo = depositoFuncao(v_deposito, saldo)

    elif op == "2":
        limparTela()
        v_saque = valorSaqueMenu(saldo)        
        saqueMenu(v_saque)
        saldo = saqueFuncao(v_saque, saldo)

    elif op == "3":
        limparTela()
        saldoMenu(saldoFuncao(saldo))

    elif op == "4":
        limparTela()
        nom, idad, enderec = consultaDados(data)
        dadosMenu(nom, idad, enderec)

    elif op == "5":
        limparTela()
        alteraDados(data)        

    elif op == "123":
        limparTela()
        volteSempre()
        break
    else :
        opInvalida()     