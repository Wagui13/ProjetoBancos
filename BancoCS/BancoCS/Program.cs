using System;

namespace BancoCS
{
    class Program
    {
        static void Main(string[] args)
        {
            
            Console.WriteLine("\n--------------------------------------------\nOlá seja bem vindo ao BBB - Banco Blue Brasil\nDeseja se tornar uma participante? S/N: ");
            string r = Console.ReadLine();
            if (r == "S" || r == "s")
            {
                //Console.WriteLine("Deseja ser do Vip ou da Chepa? V/C");
                //string r_vip = Console.ReadLine();

                Console.Write("\nDigite o seu nome: \n- ");
                string name = Console.ReadLine();

                Console.Write("Digite sua senha: \n- ");
                string senha = Console.ReadLine();
                while (senha.Length < 6)
                {
                    Console.Write("Inválido! Digite uma senha com 6 ou mais caracteres: \n- ");
                    senha = Console.ReadLine();
                }

                Console.Write("Digite a sua idade: \n- ");
                int idade = int.Parse(Console.ReadLine());

                Console.Write("Digite o seu endereço: \n- ");
                string endereco = Console.ReadLine();

                Cliente cli = new Cliente(name, senha, idade, endereco);

                while (true)
                {
                    Console.WriteLine("\n\n\n--------------------------------------------");
                    Console.WriteLine("Escolha a operação que deseja realizar:\n");
                    Console.Write("[1] Saque, [2] Deposito, [3] Saldo, [123] Sair\n\n- ");
                    int op = int.Parse(Console.ReadLine());

                    if (op == 1)
                    {
                        Console.Write("Digite o valor que deseja sacar: R$");
                        float v_saque = float.Parse(Console.ReadLine());
                        /*if (r_vip == "C" || r_vip == "c")
                        {
                            while (v_saque > cli.Csaldo)
                            {
                                Console.Write("ERRO: Valor maior que saldo atual, tente novamente pilantra: R$");
                                v_saque = float.Parse(Console.ReadLine());
                            }
                        }*/
                        cli.Csaldo = OperacoesBancarias.Saque(v_saque, cli.Csaldo);
                        Console.WriteLine($"\nSaque de R${v_saque} realizado com sucesso!");
                    }

                    else if (op == 2)
                    {
                        Console.Write("Digite o valor que deseja depositar: R$");
                        float v_deposito = float.Parse(Console.ReadLine());
                        cli.Csaldo = OperacoesBancarias.Deposito(v_deposito, cli.Csaldo);
                        Console.WriteLine($"\nDeposito de R${v_deposito} realizado com sucesso!");
                    }

                    else if (op == 3)
                    {
                        OperacoesBancarias.Saldo(cli.Csaldo);
                    }

                    else if (op == 123)
                    {
                        Console.WriteLine("--------------------------------------------");
                        Console.WriteLine("\nMuito obrigado! O BBB - Banco Blue Brasil agradece a sua preferencia, volte sempre!");
                        break;
                    }
                    else
                    {
                        Console.WriteLine("\nValor inválido, tente novamente!");
                    }
                }
                Console.WriteLine($"\n\n[Dados do Usuário - Nome: {cli.nome}, Idade: {cli.idade}, Endereço: {cli.endereco}, Saldo atual: R${cli.Csaldo}]");
                Console.ReadLine();
            }
            else
            {
                Console.WriteLine("\nQue pena, nós do BBB - Banco Blue Brasil sentimos muito, agora some daqui meu!");
            }
            
        }
    }
}
