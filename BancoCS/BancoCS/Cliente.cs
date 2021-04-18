using System;
using System.Collections.Generic;
using System.Text;

namespace BancoCS
{
    class Cliente : Usuario
    {
        public float Csaldo = 1000;
        //public string Vip;
        public Cliente(string _nome, string _senha, int _idade, string _endereco) : base(_nome, _senha, _idade, _endereco)
        {
            nome = _nome;
            senha = _senha;
            idade = _idade;
            endereco = _endereco;
            //Vip = _vip;
        }
    }

    /*class ClienteVip : Usuario
    {
        public float Csaldo = 1000;
        bool Vip = true;
        public ClienteVip(string _nome, string _senha, int _idade, string _endereco) : base(_nome, _senha, _idade, _endereco)
        {
            nome = _nome;
            senha = _senha;
            idade = _idade;
            endereco = _endereco;
        }
    }*/
}
