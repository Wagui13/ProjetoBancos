using System;
using System.Collections.Generic;
using System.Text;

namespace BancoCS
{
    class OperacoesBancarias
    {
        public static float Deposito(float deposito, float saldo)
        {
            return saldo + deposito;
        }

        public static float Saque(float saque, float saldo)
        {
            return saldo - saque;
        }

        public static void Saldo(float saldo)
        {
            System.Console.WriteLine($"\nSaldo atual: R${saldo}");
        }
    }
}
