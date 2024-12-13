# Sistema de Barbearia

# Introdução

Uma barbearia está precisando de um sistema para organizar seu processo, pois percebeu a necessidade do cadastro de clientes, dos funcionários, dos procedimentos que são realizados por cada funcionário e o agendamento dos serviços que o cliente gostaria de realizar. Como relatórios e informação, busca ter o registro dos pagamentos com os serviços que o cliente consumiu para comparar com o que foi agendado.

Para tanto, será necessária a implementação dos [módulos](#módulos) com vistas ao atendimento dos problemas elencados.

# Módulos

- [*Clientes*](ModuloClientes.md): Um módulo para registrar os dados como nome, e-mail e telefone de um clientes.

- *[Funcionários](ModuloFuncionarios.md)*: Módulo para gerenciar os funcionários.

- *[Procedimentos](ModuloProcedimento.md)*: Módulo para definir os procedimentos disponíveis na barbearia, como corte de cabelo usando máquina, corte de cabelo usando tesoura e aparar a barba. O dono da barbearia deverá informar o percentual que ele cobrará do profissional pelo procedimento.
  
- *[Procedimentos do profissional](ModuloProcedimentoProfissional)*: Módulo utilizado para associar os procedimentos disponíveis no salão com os profissionais que realizam. Cada procedimento pode ser realizado por um ou mais profissionais e contém um preço e uma duração estimada definido pelo funcionário que realiza o serviço.

- *[Agendamento de Serviços](ModuloAgendamentoServico.md)*: O cliente seleciona os procedimentos desejados, o profissional e o sistema verifica a disponibilidade dos funcionários para confirmar o agendamento. Uma vez confirmado, deverá ser informado o valor total previsto para o agendamento.

- *[Registro de Pagamento](ModuloRegistroPagamento.md)*: Após o agendamento e execução dos serviços, o módulo de pagamento calcula o total dos procedimentos realizados e associa o valor ao agendamento para finalizar a transação.
