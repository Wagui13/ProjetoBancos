# Funções para deixar a interface do banco mais agradavel.

def limparTela():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')

def bemVinde():
   print("""
+------------------------------------------------------+
|        Seja Bem Vindo(a) ao Banco Blue Brasil        |
|     Casdastre seus dados e vire um participante!     |
+------------------------------------------------------+
""")

def volteSempre():
    input(f"""
+------------------------------------------------------+
|                  Banco Blue Brasil                   |
|            Muito obrigado e volte sempre!            |
+------------------------------------------------------+
{" "*27}""")

# Tá estranho assim por causa da identação, mas confia no pai. 
def pegarDadosMenu():
    name = input(f"""
+------------------------------------------------------+
 Digite o seu nome -> """)

    psword = input(f"""+------------------------------------------------------+
 Sua senha ---------> """)
    
    while (len(psword) < 6):
        print("   Inválido! A senha precisa ter 6 ou mais caracteres ") 
        psword = input(f"""+------------------------------------------------------+
 Sua senha ---------> """)

    age = int(input("""+------------------------------------------------------+
 Agora a sua idade -> """))
    while (age < 0 or age > 150):
        print("           Idade inválida! Tente novamente:") 
        age = int(input("""+------------------------------------------------------+
 Sua idade ---------> """))
    
    adress = input(f"""+------------------------------------------------------+
 Endereço -> """)
    print(f"+{'-'*54}+")
    
    input(f"""
+------------------------------------------------------+
|                 Usuário cadastrado!                  |
+------------------------------------------------------+
                   -> Press enter <-\n{" "*27}""")
    return name, psword, age, adress 

def opInvalida():     
    input(f"""
+------------------------------------------------------+
|         Operação inválida! Tente novamente:          |
+------------------------------------------------------+
                   -> Press enter <-\n{" "*27}""")

def dadosMenu(nome, idade, endereco):
    input(f"""
+------------------------------------------------------+
 Nome: {nome}
+------------------------------------------------------+
 Idade: {idade}
+------------------------------------------------------+
 Endereço: {endereco}
+------------------------------------------------------+
                   -> Press enter <-\n{" "*27}""")

def operacoesMenu():
    op = input("""
        Escolha a operação que deseja realizar:        
+------------------------------------------------------+
| [1] Depósito  |   [2] Saque   |  [3] Consultar Saldo | 
+------------------------------------------------------+
| [4] Consultar Dados de Usuário | [5] Alterar Dados   |
+------------------------------------------------------+
|                     [123] Sair                       |
+------------------------------------------------------+
                        -> """) 
    return op

def valorDepositoMenu():
    v_deposito = float(input("""
+------------------------------------------------------+
        Digite o valor deseja depositar: R$"""))           
    # validação pra que o usuário não digite um numero negativo
    while v_deposito <= 0:
        v_deposito = float(input(f"""
+------------------------------------------------------+
|           Valor inválido! Tente novamente:           |
+------------------------------------------------------+
                        -> R$"""))
    return v_deposito

def depositoMenu(v_deposito):
    input(f"""
+------------------------------------------------------+
     Depósito de R${v_deposito} realizado com sucesso!   
+------------------------------------------------------+
                   -> Press enter <-\n{" "*27}""")

# Tá estranho assim por causa da identação, mas confia no pai. 
def valorSaqueMenu(saldo):
    v_saque = float(input("""
+------------------------------------------------------+
         Digite o valor deseja sacar: R$"""))       
    # validação para o usuário não sacar um valor maior que o seu saldo
    while v_saque > saldo:        
            v_saque = float(input("        [Valor de saque maior que saldo atual!]\n\n            Tente novamente pilantra: R$"))    
    # validação pra que o usuário não digite um numero negativo
    while v_saque <= 0:
        v_saque = float(input(f"""
+------------------------------------------------------+
|           Valor inválido! Tente novamente:           |
+------------------------------------------------------+
                        -> R$"""))
    return v_saque

def saqueMenu(v_saque):
    input(f"""
+------------------------------------------------------+
  Saque no valor de R${v_saque} realizado com sucesso!   
+------------------------------------------------------+
                   -> Press enter <-\n{" "*27}""")


def saldoMenu(v_saldo):
    input(f"""
+------------------------------------------------------+
          O seu saldo atual é de R${v_saldo}   
+------------------------------------------------------+
                   -> Press enter <-\n{" "*27}""")


def alterarDadosMenu():
    op = input("""
  Escolha o que deseja alterar ou digite 123 para sair       
+------------------------------------------------------+
| [1] Nome  |  [2] Idade |  [3] Endereço |  [4] Senha  |
+------------------------------------------------------+
|                     [123] Sair                       |
+------------------------------------------------------+
                        -> """)
    return op

def newName():
    new_name = input("""
+------------------------------------------------------+
 Digite o novo nome: """)          
    input(f"""
+------------------------------------------------------+
|              Nome alterado com sucesso!              |
+------------------------------------------------------+
                   -> Press enter <-\n{" "*27}""")
    return new_name

def newAge():
    new_age = int(input("""
+------------------------------------------------------+
 Digite a idade: """))          
    
    while (new_age < 0 or new_age > 150):
        print("           Idade inválida! Tente novamente:") 
        new_age = int(input("""+------------------------------------------------------+
 Sua idade ---------> """))
    input(f"""
+------------------------------------------------------+
|             Idade alterada com sucesso!              |
+------------------------------------------------------+
                   -> Press enter <-\n{" "*27}""")
    return new_age

def newAdress():
    new_adress = input("""
+------------------------------------------------------+
 Digite o seu novo endereço: """)          
    input(f"""
+------------------------------------------------------+
|            Endereço alterado com sucesso!            |  
+------------------------------------------------------+
                   -> Press enter <-\n{" "*27}""")
    return new_adress

# Tá estranho assim por causa da identação, mas confia no pai.
def newPsword():
    new_psword = input(f"""+------------------------------------------------------+
             Digite sua nova senha: """)    
    while (len(new_psword) < 6):
        print("   Inválido! A senha precisa ter 6 ou mais caracteres ") 
        new_psword = input(f"""+------------------------------------------------------+
             Digite sua nova senha """)         
    input(f"""
+------------------------------------------------------+
|             Senha alterada com sucesso!              |
+------------------------------------------------------+
                   -> Press enter <-\n{" "*27}""")
    return new_psword

def opEncerrada():
    input(f"""
+------------------------------------------------------+
|            [Alteração de dados encerrada]            |
+------------------------------------------------------+
                   -> Press enter <-\n{" "*27}""")

