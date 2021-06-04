import operacoesBanco
import menus

menus.bemVinde() # mensagem de bem vindo

# menu que pega os dados do usuário
name = input(f"+{'-'*54}+\n Digite o seu nome -> ")

psword = input(f"+{'-'*54}+\n Sua senha ---------> ")
while (len(psword) < 6):
    print("   Inválido! A senha precisa ter 6 ou mais caracteres") 
    psword = input(f"+{'-'*54}+\n Sua senha ---------> ")

age = int(input(f"+{'-'*54}+\n Agora a sua idade -> "))
while (age < 0 or age > 150):
    print("\t\t   Idade inválida! Tente novamente:") 
    age = int(input("+{'-'*54}+\n Sua idade ---------> "))

adress = input(f"+{'-'*54}+\n Endereço -> ")
print(f"+{'-'*54}+")

menus.caixaTexto('        Usuário cadastrado!       ')

data = {"Nome": name, "Idade": age, "Endereco": adress} # armazenamento dos dados num dicionário
saldo = 1000.0 # vai melhorar isso aqui rlx

while True:
    menus.limparTela() # cls ou clear para limpar a tela
    op = menus.operacoesMenu() # menu de operações: saque, deposito, saldo, dados do usuário e alteração de dados
    
    if op == "1":
        menus.limparTela()
        v_deposito = float(input(f"+{'-'*54}+\n\tDigite o valor deseja depositar: R$").replace(',','.'))           
        v_deposito, saldo = operacoesBanco.depositoFuncao(v_deposito, saldo)
        menus.depositoMenu(v_deposito)

    elif op == "2":
        menus.limparTela()
        v_saque = float(input(f"+{'-'*54}+\n\tDigite o valor deseja sacar: R$").replace(',','.')) 
        v_saque, saldo = operacoesBanco.saqueFuncao(v_saque, saldo)
        menus.saqueMenu(v_saque)

    elif op == "3":
        menus.limparTela()
        menus.saldoMenu(operacoesBanco.consultaSaldoFuncao(saldo))

    elif op == "4":
        menus.limparTela() 
        nom, idad, enderec = operacoesBanco.consultaDados(data) # posteriormente isso vai virar um get
        menus.consultaDadosMenu(nom, idad, enderec)

    elif op == "5":
        menus.limparTela()
        operacoesBanco.alteraDados(data)        

    elif op == "123":
        menus.limparTela()
        menus.volteSempre()
        break
    else :
        menus.caixaTexto('Operação inválida! Tente novamente')     