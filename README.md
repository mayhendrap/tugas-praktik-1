# Tugas Praktik 1 - Perancangan Kelas dan Objek

IF104 Pemrograman Berorientasi Objek

- NIM: 1003260002
- Domain kasus: Toko (digit terakhir NIM = 2)
- Nilai dasar: 32 (digit ke-4 dan ke-5), sehingga `productPrice` = 32.000
- Class model: `Product0002`, class pengelola: `Store`

## Struktur Folder

```
src/
└── java/
    ├── Main.java
    ├── Product0002.java
    └── Store.java
```

## Kompilasi dan Menjalankan (JDK 17+)

Kompilasi dari folder root project:

```bash
javac -d out src/java/*.java
```

Jalankan:

```bash
java -cp out Main
```

## Contoh Output

```
Daftar produk Toko Maju Jaya:
  Buku Tulis   | Rp    32,000 | stok  50
  Pensil       | Rp    50,000 | stok  20
Beli 3 Buku Tulis : Rp96,000
Beli 5 Pensil : Rp250,000
Nilai persediaan toko : Rp2,600,000
```
