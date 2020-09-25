
let dataSet = 
[
    {
        "id": "1",
        "name": "Tiger Nixon",
        "position": "System Architect",
        "salary": "$320,800",
        "start_date": "2011/04/25",
        "office": "Edinburgh",
        "extn": "5421"
    },
]

$(document).ready(function () {
    $('#example').DataTable({
        data: dataSet,
        "columns": [
            { "data": "name" },
            { "data": "position" },
            { "data": "office" },
            { "data": "extn" },
            { "data": "start_date" }
        ]
    });
});