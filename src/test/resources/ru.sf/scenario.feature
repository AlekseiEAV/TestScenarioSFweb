
Feature: Find product
#Вводи страну Турция и получаем поиск недвижимости в турции
  Scenario: chose product
    Given url of market 'https://prian.ru/'
    Then website its open search 'Турция'
    And assert completed search 'Поиск недвижимости в Турции'
    #Вводим страну россия и получаем сообщение что такой страны не найдено
  Scenario: chose product not found
    Given url of market 'https://prian.ru/'
    Then website its open search 'Россия'
    And assert fail search 'По вашему запросу не найдено предложений'


