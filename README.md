# Expressões Matemáticas

## :memo: Descrição
O projeto converte expressões matemáticas infixas para posfixas
Uma expressão infixa é expressão como conhecmos, por exemplo: a+b* c
Uma expressão posfixa não depende da ordem de prioridade ou parenteses, por exemplo: abc* +

A expressão posfixa ela compara as duas variáveis anteriores ao operador e realiza a operação, por exemplo: bc* == b * c
No exemplo: a+b* c, para pos fixa fica abc* +. Ele realiza primeiro b*c e depois soma com a.

## :wrench: Tecnologias utilizadas 
* Java

## :dart: Status do projeto
* :heavy_check_mark:  Complete

## Funções
* **EntradaValores:** Recebe como parâmetro a expressão infixa no formato de String. Ela adiciona os valores de cada variável em um vetor.
* **Prioridade:** Retorna as prioridades das operações (+, -, *, / e ^)
* **ConverterPosfixa:** Recebe como parâmetro a expressão infixa no formato de String. Ela usa um algoritimo para converter a expressão de infixa para posfixa
* **AtribuirValores:** Recebe como parâmetros a expressão posfixa em String e o vetor dos valores. Ela retorna o resultado da expressão a partir da expressão posfixa

## Autores
* Henrique Yuji - https://github.com/henrique340
* André Guimarães - https://github.com/AndreGuimaraes01
