if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'KotlintoJavascript'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'KotlintoJavascript'.");
}
var KotlintoJavascript = function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  function main$lambda(it) {
    println('Butona t\u0131klad\u0131n\u0131z');
  }
  function main(args) {
    var root = document.getElementById('root');
    var h1 = document.createElement('h1');
    h1.textContent = "Merhaba bu ba\u015Fl\u0131k Kotlin'den";
    var btn = document.createElement('button');
    btn.textContent = 'T\u0131klay\u0131n\u0131z';
    (btn != null ? btn : Kotlin.throwNPE()).addEventListener('click', main$lambda);
    (root != null ? root : Kotlin.throwNPE()).appendChild(h1);
    (root != null ? root : Kotlin.throwNPE()).appendChild(btn);
  }
  _.main_kand9s$ = main;
  Kotlin.defineModule('KotlintoJavascript', _);
  main([]);
  return _;
}(typeof KotlintoJavascript === 'undefined' ? {} : KotlintoJavascript, kotlin);
