async function loginUser() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    const res = await fetch("/auth/login", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ username, password })
    });

    const result = await res.text();

    if (result === "SUCCESS") {
        window.location.href = "dashboard.html";
    } else {
        alert("Invalid credentials");
    }
}

async function registerUser() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    await fetch("/auth/register", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ username, password })
    });

    alert("Registered Successfully");
    window.location.href = "login.html";
}
