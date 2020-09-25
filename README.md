# MercadoDeTransferenciaBR

O projeto está situado em um contexto fictício baseado no Mercado de Transferência de jogadores do 
futebol brasileiro/CBF. 
Os padrões de projeto escolhidos para a solução do problema foram: 
State, Template e Observer.

* **Método State**: Usado na janela de transferência pois está possui um estado Aberta/Fechada;

* **Método Template**: Usado na funçao transferir jogador, pois é necessário seguir uma ordem de passos
para regularizar a transferência de um jogador.

* **Método Observer**: Usado para disparar mensagens para os Observadores da Janela, no caso Clubes/Site,
ou seja, assim que a janela tem seu estado alterado(aberta ou fechada), são disparados uma mensagem 
notificando os clubes e também o site da CBF.



**Alunos**:
* caio.cesar209@gmail.com => Caio César da Rocha Anastácio
* pedro.anastacio013@gmail.com => Pedro Henrique da Rocha Anastácio
 
