'use strict';


/**
 * liste les personnes
 *
 * returns List
 **/
exports.personsGET = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "id" : 1,
  "firstName" : "toto",
  "lastName" : "toto",
  "age" : 22
}, {
  "id" : 2,
  "firstName" : "tata",
  "lastName" : "tata",
  "age" : 45
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

