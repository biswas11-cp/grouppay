document.addEventListener("DOMContentLoaded", () => {
    loadJoinedWallets();
});

function loadJoinedWallets() {
    fetch("http://localhost:9090/api/wallet/all")
        .then(res => res.json())
        .then(wallets => {
            const grid = document.querySelector(".grid");
            grid.innerHTML = "";

            if (wallets.length === 0) {
                grid.innerHTML = `
                  <p class="text-gray-500 col-span-3 text-center">
                    No wallets found
                  </p>`;
                return;
            }

            wallets.forEach(wallet => {
                const card = document.createElement("div");
                card.className =
                    "bg-white rounded-lg shadow-md p-6 hover:shadow-lg transition-shadow";

                card.innerHTML = `
                    <div class="flex justify-between items-start mb-4">
                        <h3 class="text-lg font-semibold text-gray-900">
                            ${wallet.walletName}
                        </h3>
                        <span class="bg-green-100 text-green-800 text-xs px-2 py-1 rounded-full">
                            Active
                        </span>
                    </div>

                    <div class="space-y-2 text-sm text-gray-600">
                        <p><b>Withdraw:</b> ${wallet.withdrawPermission}</p>
                        <p><b>Add Members:</b> ${wallet.addMemberPermission}</p>
                        <p><b>UPI Access:</b> ${wallet.upiPermission}</p>
                        <p><b>UPI Alias:</b> ${wallet.upiAlias}</p>
                    </div>

                    <div class="mt-4 text-right">
                        <a href="wallet-details.html?id=${wallet.id}"
                           class="text-indigo-600 hover:text-indigo-700 font-medium">
                           View Details →
                        </a>
                    </div>
                `;

                grid.appendChild(card);
            });
        })
        .catch(err => console.error("Error loading wallets:", err));
}

function viewWallet(walletId) {
    window.location.href = `wallet-details.html?id=${walletId}`;
}
