using System;

namespace BancoCS
{
    class Usuario
    {
        public string nome;
        public string senha;
        public int idade;
        public string endereco;

        public Usuario(string _nome, string _senha, int _idade, string _endereco)
        {
            nome = _nome;
            senha = _senha;
            idade = _idade;
            endereco = _endereco;
        }
    }
}
