BeritaApp
Aplikasi Android sederhana untuk menampilkan berita terkini menggunakan [NewsAPI.org](https://newsapi.org).

### Menjalankan Proyek

#### 1. Clone Repo

```bash
git clone https://github.com/username/beritaapp.git
cd beritaapp
```

#### 2. Tambahkan `NEWS_API_KEY`

Buat file bernama `local.properties` di root folder project (sejajar dengan `build.gradle`) dan tambahkan:

```
NEWS_API_KEY=your_api_key_here
```

> **Catatan:** `local.properties` sudah masuk `.gitignore`, jadi tidak akan di-upload ke GitHub. Pastikan kamu punya API key dari [https://newsapi.org](https://newsapi.org) dan tambahkan sendiri.
