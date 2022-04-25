// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsers();
  $('#dataTable').DataTable();
});

async function loadUsers() {
  const request = await fetch('users', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const users = await request.json();

  console.log(users);

  let listHTML = ' ';
  for(let user of users){
    let userHTML = '<tr><td>'+user.id+'</td><td>'+user.name+'</td><td>'+user.lastName+'</td><td>'+user.email+'</td><td>'+user.phone+'</td></tr>';
    listHTML += userHTML;
  }
  document.querySelector('#dataTable tbody').outerHTML = listHTML;
}