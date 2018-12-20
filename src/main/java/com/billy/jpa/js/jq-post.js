// NOTE: This example will only work if you run it on a web server (it will not work locally)
// You can try it out on the website for the book http://javascriptbook.com/code/c08/
// or run it on your own server.

$('#register').on('submit', function(e) {           // When form is submitted
  e.preventDefault();                               // Prevent it being sent
  var details = $('#register').serialize();         // Serialize form data
  $.get('http://localhost:8080/t1/department', details, function(data) {  // Use $.post() to send it
    $('#content').html(data);                    // Where to display result

  });
});