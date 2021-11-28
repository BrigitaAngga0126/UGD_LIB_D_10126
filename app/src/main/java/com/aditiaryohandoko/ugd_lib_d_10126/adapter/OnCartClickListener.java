package com.aditiaryohandoko.ugd_lib_d_10126.adapter;

import com.aditiaryohandoko.ugd_lib_d_10126.model.PurchasedGame;

public interface OnCartClickListener {
    void onTambah(PurchasedGame purchasedGame, int position);
    void onKurang(PurchasedGame purchasedGame, int position);
}
