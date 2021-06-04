# Funções para deixar a interface do banco mais agradavel.

import os 
def limparTela():
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
    limparTela()


def validaSaqueDeposito():
    v_operacao = float(input(f"""
+------------------------------------------------------+
|           Valor inválido! Tente novamente:           |
+------------------------------------------------------+
                        -> R$""").replace(',','.'))
    return v_operacao


def caixaTexto (msgCaixa):
  input(f"""
+------------------------------------------------------+
|         {          msgCaixa              }           |
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


def consultaDadosMenu(nome, idade, endereco):
    input(f"""
+------------------------------------------------------+
 Nome: {nome}
+------------------------------------------------------+
 Idade: {idade}
+------------------------------------------------------+
 Endereço: {endereco}
+------------------------------------------------------+
                   -> Press enter <-\n{" "*27}""")


def depositoMenu(v_deposito):
    input(f"""
+------------------------------------------------------+
     Depósito de R${v_deposito} realizado com sucesso!   
+------------------------------------------------------+
                   -> Press enter <-\n{" "*27}""")


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