package com.example.lab8_cli.StatsBundle;

import java.util.ListResourceBundle;

public class StatsBundle extends ListResourceBundle {

    private final Object[][] resources = {
            {"UsernameLabel","username"},
            {"PasswordLabel", "password"},
            {"RefreshButton","Refresh"},
            {"InfoButton", "Info"},
            {"AddButton","Add"},
            {"UpdateButton","Update"},
            {"RemoveButton","Remove"},
            {"ClearButton","Clear"},
            {"ExecuteScriptButton", "Script"},
            {"AddIfMaxButton","Add if max"},
            {"RemoveGreaterButton","Remove greater"},
            {"CountLessThanFuelTypeButton", "Count less than FuelType"},
            {"FilterLessThanFuelConsumptionButton","Filter less than fuel consumption"},
            {"GroupCountingByCapacityButton","Group counting by capacity"},
            {"RefreshButtonTooltip","Update canvas and table"},
            {"InfoButtonTooltip","Show information about the collection"},
            {"AddButtonTooltip","Add a new element to the collection"},
            {"UpdateButtonTooltip","Update an element in the collection"},
            {"RemoveButtonTooltip","Remove an element from the collection"},
            {"ClearButtonTooltip","Clear the collection"},
            {"ExecuteButtonTooltip","Execute script from a file"},
            {"AddIfMaxButtonTooltip","Add a new element if its value's more than the biggest one's"},
            {"RemoveGreaterButtonTooltip","Remove all elements which is higher than selected"},
            {"IdColumn","ID"},
            {"OwnerColumn","Owner"},
            {"CreationDateColumn","Creation Date"},
            {"NameColumn","Name"},
            {"CoordinatesXColumn","X"},
            {"CoordinatesYColumn","Y"},
            {"EnginePowerColumn","Engine power"},
            {"CapacityColumn","Capacity"},
            {"FuelConsumptionColumn","Fuel Consumption"},
            {"FuelTypeColumn","Fuel Type"},
            {"TableTab","Table"},
            {"CanvasTab","Canvas"},
            {"EnterButton","Enter"},
            {"NameEmptyException","Name can't be empty!"},
            {"CoordinatesXFormatException","X must be a number!"},
            {"CoordinatesYFormatException","Y must be a number!"},
            {"UpdateButtonSelectionException","Select the vehicle to update!"},
            {"RemoveButtonSelectionException","Select the vehicle to remove!"},
            {"RemoveGreaterButtonSelectionException","Select the vehicle to remove greater!"},
            {"EnterName","Enter a name:"},
            {"NameNotIdentifiedException","Name isn't recognized!"},
            {"UnexpectedException","Unexpected error!"},
            {"EnterX","Enter X coordinate:"},
            {"XNotIdentifiedException","X coordinate isn't recognized!"},
            {"XMustBeNumberException","The X coordinate must be a number!"},
            {"EnterY","Enter the Y coordinate< {0}:"},
            {"YNotIdentifiedException","Y Not recognized!"},
            {"YMustBeNumberException","The Y-coordinate must be represented by a number!"},
            {"YMustBeLessException","Y must not exceed{0}!"},
            {"ScriptRecursionException","Scripts cannot be called recursively!"},
            {"IncorrectInputInScriptException","Script execution is interrupted!"},
            {"CommandNotFoundException","Command'' {0}''not found.Type''help'' for reference."},
            {"Using","Use:'' {0}''"},
            {"ChangeNameQuestion","Want to change the vehicle's name?"},
            {"ChangeCoordinatesQuestion","Want to change the vehicle's coordinates?"},
            {"ClientException","Client cannot be started!"},
            {"EndWorkOfClient"," Client has stopped."},
            {"EndWorkOfClientException","An error has occurred when trying to terminate the connection to the server!"},
            {"EndRunningWorkOfClientException","Cannot terminate connection not yet established!"},
            {"DataSendingException","Error has occurred when sending data to the server!"},
            {"DataReadingException","Error has occurred while reading the received data!"},
            {"EndConnectionToServerException","Connection with server broken down!"},
            {"ConnectionToServerComplete","Connection with server established!"},
            {"TryCommandLater","Try to repeat the command later."},
            {"TryAuthLater","Try to repeat authentication later."},
            {"ConnectionToServer","Connecting with server..."},
            {"ServerAddressException","Server address is not entered correctly!"},
            {"ConnectionToServerException","A error has occurred when connecting to the server!"},
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