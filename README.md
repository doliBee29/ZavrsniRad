## Uvod

**BeautySalon** je Java desktop aplikacija koja služi kao organizator poslovanja za kozmetički salon (sistem se može primjeniti i na ostale vrste poslovanja): služi za evidenciju 
ugovorenih termina od strane klijenata, evidenciju samih klijenata kao i zaposlenika te usluga. Korisničko sučelje aplikacije izrađeno je u Swing okruženju, dok se podaci spremaju
u MySQL bazu podataka na lokalnom disku. Za posredstvo između korisničkog sučelja i baze odgovoran je Hibernate ORM.

## Korišteni alati

* [Java JDK 14](https://www.oracle.com/java/technologies/javase/14-relnote-issues.html)
* [MariaDB](https://mariadb.org/)
* [Apache Netbeans IDE](http://netbeans.apache.org/)
* [Hibernate ORM](http://hibernate.org/orm/)
* [DBeaver](https://dbeaver.io/)
* [Java Faker](https://github.com/DiUS/java-faker)
* [LGoodDatePicker](https://github.com/LGoodDatePicker/LGoodDatePicker)
* [Java API for Microsoft Documents](https://poi.apache.org/)
* [JavaMail API](https://poi.apache.org/)

## Sažetak

Aplikaciji se pristupa ulogiravanjem u prozoru za autorizaciju upisivanjem odgovarajuće e-mail adrese i lozinke: ovisno o ulozi (administrator ili operater) prikazuju se određene
kategorije aplikacije. BeautySalon aplikacija se sastoji od glavnog prozora u kojemu je dostupan izbornik za ostale kategorije dostupne u aplikacije. Administratori imaju 
mogućnost uvida u sve kategorije aplikacije, dok operateri imaju mogućnost uvida samo u kategorije Termina i Klijenta. 


<p align="center">
<img src="https://github.com/doliBee29/ZavrsniRad/blob/master/src/main/resources/pics_screenshots/autorizacija_screenshoot.PNG" />
</p><br />

* **Glavni izbornik** na kojemu su vidljive sve dostupne kategorije i putem kojega se pristupa istima. Putem glavnog izbornika moguće je pristupiti mrežnim stranicama Facebook-a i 
  Instagram-a u svrhu marketinga i oglašavanja. Pored tih ikonica dodan je digitalni sat koji prikazuje trenutni dan i vrijeme.

<p align="center">
<img src="https://github.com/doliBee29/ZavrsniRad/blob/master/src/main/resources/pics_screenshots/izbornik_screenshot.PNG" />
</p><br />


* Kategorija **"Zaposlenik"** odgovorna je za CRUD zaposlenika. Pristup ovoj kategoriji ima samo administrator - osoba koja bi vodila poslovanje te evidenciju o zaposlenicima,
  njihovima ulogama, uslugama koje će pružati te njihovim osnovnim podacima.

<p align="center">
<img src="https://github.com/doliBee29/ZavrsniRad/blob/master/src/main/resources/pics_screenshots/zaposlenici_screenshot.PNG" />
</p><br />


* Kategorija **"Usluga"** odgovorna je za CRUD usluga. Pristup ovoj kategoriji ima samo administrator - osoba koja bi vodila poslovanje te evidenciju o uslugama. Ima mogućnost
  unositi nove usluge koje želi u poslovanju, pripisivati zaposlenike određenim uslugama (određivanje tko radi koju uslugu) te im odrediti cijenu i opis.
  
<p align="center">
<img src="https://github.com/doliBee29/ZavrsniRad/blob/master/src/main/resources/pics_screenshots/usluge_screenshot.PNG" />
</p><br />

* Kategorija **"Klijenti"** odgovorna je za CRUD i evidenciju klijenata. Pristup ovoj kategoriji imaju svi - i operter i admnistrator. Ova kategorija ima mogućnost exporta
  podataka o klijentima u Excel za koju je odgovoran Apache POI - Java API za Microsoft Documents. Dakle, omogućeno je izraditi i pohraniti Excel datoteku radi analize klijenata
  koji su osnova svakog poslovanja. :smile: 
  
<p align="center">
<img src="https://github.com/doliBee29/ZavrsniRad/blob/master/src/main/resources/pics_screenshots/klijenti_screenshot.PNG" />
</p><br />

* Kategorija **"Termini"** odgovorna je za CRUD i evidenciju termina. Ovoj kategoriji imaju svi pristup - i operateri i administratori. U ovu kategoriju implementiran je 
  JavaMail API pomoću kojeg je omogućeno slanje podsjetnika klijentima na ugovoren termin putem e-maila. Također, radi analize poslovanja omogućeno je izraditi Excel datoteku
  i pohraniti ju.


  <p align="center">
<img src="https://github.com/doliBee29/ZavrsniRad/blob/master/src/main/resources/pics_screenshots/termini_screenshot.PNG" />
</p><br />
<p align="center">
<img src="https://github.com/doliBee29/ZavrsniRad/blob/master/src/main/resources/pics_screenshots/termini_mail_screenshot.PNG" />
</p><br />

<img src="https://github.com/doliBee29/ZavrsniRad/blob/master/src/main/resources/pics_screenshots/mail_poslan_screenshot.PNG" width ="425"/> <img src="https://github.com/doliBee29/ZavrsniRad/blob/master/src/main/resources/pics_screenshots/gmail_screenshot.PNG" /></p><br />
<br />
<br />

* **Značajke koje još želim dodati:**
  - [x] ~~Excel export kod Termina~~
  - [x] ~~Excel export kod Klijenta~~
  - [ ] Excel export kod Zaposlenika
  - [ ] Excel export kod Usluga
  - [ ] PDF export Termina
  - [ ] PDF export Klijenta
  - [ ] PDF export Usluga
  
<br />


* **Hvala na pozornosti!**

  ![alt-text](https://github.com/doliBee29/ZavrsniRad/blob/master/src/main/resources/pics_screenshots/source.gif)











