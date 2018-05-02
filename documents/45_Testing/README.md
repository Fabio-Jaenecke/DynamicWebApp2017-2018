# Automatisierte Tests

## Selenium Tests
Die Test-Suite ist in der Datei ```Histarantia - Testsuite.side``` enhalten.

### Anleitung:

1. Laden Sie die Datei ```Histarantia - Testsuite.side``` herunter auf Ihren Desktop.
2. Installieren Sie das Plugin "Selenium IDE Web Driver" für Google Chrome, Mozilla Firefox oder MS Edge:
[Chrome-Plugin](https://chrome.google.com/webstore/detail/selenium-ide/mooikfkahbdckldjjndioackbalphokd)
[Firefox-Plugin](https://addons.mozilla.org/de/firefox/addon/selenium-ide/)
[MS Edge-Plugin](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/)
3. Deployen Sie die Histarantia-Applikation:
- Öffnen Sie den Browser, von welchem Sie das Selenium-Plugin installiert haben.
- Vergewissern Sie sich, dass sie sich im Verzeichnis ```http://localhost:8080/PSIT2/``` befinden.
4. Öffnen Sie das Selenium Plugin.
5. Klicken Sie im Selenium Web Driver auf "Open Project" und importieren die Datei ```Histarantia - Testsuite.side```
6. Sie können nun einzelne Tests mit "Run Current Test" oder alle Tests mit "Run all tests in suite" ausführen.
7. Der Ausgangspunkt von jedem Test muss ```http://localhost:8080/PSIT2/``` sein.
