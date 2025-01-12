document.getElementById('profileBtn').addEventListener('click', function () {
    const form = document.forms['frmProfile'];
    if (form) {
        form.submit();
    }
});