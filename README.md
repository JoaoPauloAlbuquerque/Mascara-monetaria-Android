
# Máscara monetária para EditText
*Este projeto foi desenvolvido utilizando a linguagem de programação Java na plataforma Android.*

Utilizando a classe anônima TextWatcher, é possível criar diferentes tipos de máscara para o seu EditText. Segue um exemplo de criação da classe:
```
editText.addTextChangedListener(new TextWatcher() {
            
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
});
```
Clique [aqui](https://github.com/JoaoPauloAlbuquerque/Mascara-monetaria-Android/blob/master/app/src/main/java/com/example/maskedittext/MainActivity.java) para acessar o arquivo .java com o código completo.

Clique [aqui](https://github.com/JoaoPauloAlbuquerque/Mascara-monetaria-Android/blob/master/app/src/main/res/layout/activity_main.xml) para acessar o arquivo .XML com o código do EditText.
