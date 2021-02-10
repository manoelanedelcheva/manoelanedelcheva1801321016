$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("reservation.feature");
formatter.feature({
  "line": 2,
  "name": "Запазване на места за кинопрожекция",
  "description": "",
  "id": "запазване-на-места-за-кинопрожекция",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Запазване на места за прожекция с валидни данни и попълнени всички полета",
  "description": "",
  "id": "запазване-на-места-за-кинопрожекция;запазване-на-места-за-прожекция-с-валидни-данни-и-попълнени-всички-полета",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Потребителя отваря страницата за резервации",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Въвежда име \"Александра\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Въвежда фамилия \"Стоева\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Въвежда № на карта \"052698574\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Въвежда кино \"Cinema City Stara Zagora\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Въвежда филм \"Frozen\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Въвежда прожекция \"2/5/2021 19:45\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Въвежда брой желани места  \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Въвежда желано място \"3N\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Натиска бутон за потвърждаване на резервация.",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Вижда съобщение  за успех.",
  "keyword": "Then "
});
});