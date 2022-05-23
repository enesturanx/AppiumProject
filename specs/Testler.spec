Ozdilekteyim Uygulamasi Test
============================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`

Giris
--------
* "5" kadar bekle
* "//*[@resource-id='com.ozdilek.ozdilekteyim:id/btnSuccess']" xpath'li elemente tıkla
* "5" kadar bekle
* "com.ozdilek.ozdilekteyim:id/iv_storeTopLogo" Element Id ile Test Kontrolü
* "3" kadar bekle

Alisveris Sayfasi
-----------------
* "com.ozdilek.ozdilekteyim:id/tv_startShoppingStore" İd'li elemente tıkla
* "5" kadar bekle
* "com.ozdilek.ozdilekteyim:id/tvMarketName" Element Id ile Test Kontrolü
* "2" kadar bekle

Kategoriler Sayfasi
-------------------
* "//*[@resource-id='com.ozdilek.ozdilekteyim:id/nav_categories']" xpath'li elemente tıkla
* "5" kadar bekle
* "//android.widget.LinearLayout[@content-desc='Markalar']" Element xpath ile Test Kontrolü
* "3" kadar bekle

Urun Detay Sayfasi
------------------
* "//*[@text='Kadın']" xpath'li elemente tıkla
* "5" kadar bekle
* "//*[@text='Pantolon']" xpath'li elemente tıkla
* "5" kadar bekle
* Sayfayı kaydır
* "5" kadar bekle
* Random ürün seç
* "5" kadar bekle
* "com.ozdilek.ozdilekteyim:id/relLayAddCartBtn" Element Id ile Test Kontrolü
* "3" kadar bekle

Favoriler Butonu
----------------
* "com.ozdilek.ozdilekteyim:id/relLayAddFav" İd'li elemente tıkla
* "5" kadar bekle
* "com.ozdilek.ozdilekteyim:id/etEposta" Element Id ile Test Kontrolü
* "2" kadar bekle

Sepete urun ekleme
------------------
* "com.ozdilek.ozdilekteyim:id/etEposta" İd'li elemente "enesturan" değerini yaz
* "1" kadar bekle
* "com.ozdilek.ozdilekteyim:id/etPassword" İd'li elemente "12345" değerini yaz
* "1" kadar bekle
* "com.ozdilek.ozdilekteyim:id/ivBack" İd'li elemente tıkla
* "1" kadar bekle
* "com.ozdilek.ozdilekteyim:id/ivBack" İd'li elemente tıkla
* "2" kadar bekle
* Random ürün seç
* "2" kadar bekle
* "com.ozdilek.ozdilekteyim:id/relLayAddCartBtn" İd'li elemente tıkla
* "2" kadar bekle

