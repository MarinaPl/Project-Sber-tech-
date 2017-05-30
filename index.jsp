<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Добро пожаловать </title>
         </head>
    <body>
        <h1> Transfer </h1><table border="0">
            <thead>
                <tr>
                    <th>Чтобы перевести необходимую сумму, заполните форму ниже.</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>В первом окошке введите свой ИНН, во втором ИНН получателя и укажите сумму перевода</td>
                </tr>
                <tr>
                    <td></td>
                </tr>
            </tbody>
        </table>

    </body>

    <input type="text" name="ИНН отправителя" value="" size="20" />
    <input type="text" name="ИНН получателя" value="" size="20" />
    
    
    <input type="text" name="сумма перевода" value="0" size="20" />
    <input type="submit" value="подтвердить" />
   
    
</html>
