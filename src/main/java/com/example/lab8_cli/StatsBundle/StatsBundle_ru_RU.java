package com.example.lab8_cli.StatsBundle;

import java.util.ListResourceBundle;

public class StatsBundle_ru_RU extends ListResourceBundle {

    private final Object[][] resources = {
            {"UsernameLabel","имя пользователя"},
            {"PasswordLabel", "пароль"},
            {"RefreshButton","Обновить"},
            {"InfoButton", "Информация"},
            {"AddButton","Добавлять"},
            {"UpdateButton","Обновлять"},
            {"RemoveButton","Удалять"},
            {"ClearButton","чистый"},
            {"ExecuteScriptButton", "Скрипт"},
            {"AddIfMaxButton","Добавить, если макс"},
            {"RemoveGreaterButton","Удалить больше"},
            {"CountLessThanFuelTypeButton", "Считать меньше, чем тип топлива"},
            {"FilterLessThanFuelConsumptionButton","Фильтр меньше, чем расход топлива"},
            {"GroupCountingByCapacityButton","Групповой учет по мощности"},
            {"RefreshButtonTooltip","Обновить холст и таблицу"},
            {"InfoButtonTooltip","Показать информацию о коллекции"},
            {"AddButtonTooltip","Добавить новый элемент в коллекцию"},
            {"UpdateButtonTooltip","Обновить элемент в коллекции"},
            {"RemoveButtonTooltip","Удалить элемент из коллекции"},
            {"ClearButtonTooltip","Очистить коллекцию"},
            {"ExecuteButtonTooltip","Выполнить скрипт из файла"},
            {"AddIfMaxButtonTooltip","Добавить новый элемент, если его значение больше, чем у самых больших"},
            {"RemoveGreaterButtonTooltip","Удалить все элементы выше выбранного"},
            {"IdColumn","ид"},
            {"OwnerColumn","Владелец"},
            {"CreationDateColumn","Дата создания"},
            {"NameColumn","Имя"},
            {"CoordinatesXColumn","X"},
            {"CoordinatesYColumn","Y"},
            {"EnginePowerColumn","мощность двигателя"},
            {"CapacityColumn","Вместимость"},
            {"FuelConsumptionColumn","Потребление топлива"},
            {"FuelTypeColumn","Тип топлива"},
            {"TableTab","табли́ца"},
            {"CanvasTab","Холст"},
            {"EnterButton","Войти"},
            {"NameEmptyException","Имя не может быть пустым!"},
            {"CoordinatesXFormatException","Х должно быть числом!"},
            {"CoordinatesYFormatException","Y должно быть числом!"},
            {"UpdateButtonSelectionException","Выберите автомобиль для обновления!"},
            {"RemoveButtonSelectionException","Выберите транспортное средство для удаления!"},
            {"RemoveGreaterButtonSelectionException","Выберите автомобиль, чтобы удалить больше!"},
            {"EnterName","Введите имя:"},
            {"NameNotIdentifiedException","Имя не распознано!"},
            {"UnexpectedException","Неожиданная ошибка!"},
            {"EnterX","Введите координату X:"},
            {"XNotIdentifiedException","Координата X не распознается!"},
            {"XMustBeNumberException","Координата X должна быть числом!"},
            {"EnterY","Введите координату Y:"},
            {"YNotIdentifiedException","Y Не распознан!"},
            {"YMustBeNumberException","Координата Y должна быть представлена числом!"},
            {"YMustBeLessException","Y не должен превышать 0!"},
            {"ScriptRecursionException","Скрипты нельзя вызывать рекурсивно!"},
            {"IncorrectInputInScriptException","Выполнение скрипта прерывается!"},
            {"CommandNotFoundException","Команда не найдена. Введите «help» для справки."},
            {"Using","Use:'' {0}''"},
            {"ClientException","Клиент не может быть запущен!"},
            {"EndWorkOfClient","Клиент остановился."},
            {"EndWorkOfClientException","Произошла ошибка при попытке разорвать соединение с сервером!"},
            {"EndRunningWorkOfClientException","Невозможно разорвать еще не установленное соединение!"},
            {"DataSendingException","Произошла ошибка при отправке данных на сервер!"},
            {"DataReadingException","Произошла ошибка при чтении полученных данных!"},
            {"EndConnectionToServerException","Соединение с сервером прервано!"},
            {"ConnectionToServerComplete","Соединение с сервером установлено!"},
            {"TryCommandLater","Попробуйте повторить команду позже."},
            {"TryAuthLater","Попробуйте повторить аутентификацию позже."},
            {"ConnectionToServer","Соединение с сервером..."},
            {"ServerAddressException","Адрес сервера введен неправильно!"},
            {"ConnectionToServerException","Произошла ошибка при подключении к серверу!"},
            {"CountLessThanFuelTypeButtonTooltip", "Count the number of vehicle has fuel type less than the given one"},
            {"FilterLessThanFuelConsumptionButtonTooltip", "Filter the vehicle that less than the given fuel type"},
            {"GroupCountingByCapacityButtonTooltip", "Group count by capacity"},
            {"RefreshButtonTooltip", "refresh"},
            {"RegisterCheckbox", "Regiter box"},
            {"SignInButton", "Sign in "},
            {"Summit", "Summit"},
            {"Connected", "Connected"},
            {"NotConnected", "NotConnected"}
    };

    @Override
    protected Object[][] getContents() {
        return resources;
    }
}