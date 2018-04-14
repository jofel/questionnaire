
//import Vue from 'vue'
//import App from './App.vue'
//
//new Vue({
//	el: '#app',
//	render: h => h(App)
//})


// new Vue(
// 		{
// 			el : '#vue-app',
// 			data : {
// 				topics : [ 'Általános', 'Kultura', 'Sport', 'Higénia' ],
// 				questions : [],
// 						{
// 							topic : 'Általános',
// 							title : 'Általános 01',
// 							question : 'Mit gondol általában a ..........................................................-ról?',
// 							answer : '0'
// 						},
// 						{
// 							topic : 'Kultura',
// 							title : 'Kultura 01',
// 							question : 'Mit gondol a Kulturá-ról?',
// 							answer : '0'
// 						},
// 						{
// 							topic : 'Sport',
// 							title : 'Sport 01',
// 							question : 'Mit gondol a Sport-ról?',
// 							answer : '0'
// 						},
// 						{
// 							topic : 'Higénia',
// 							title : 'Higénia 01',
// 							question : 'Mit gondol általában a .................. ................... .......... ............... ............ ...........................-ról?',
// 							answer : '0'
// 						}
// 						],
// 				name : 'Jofel',
// 			},
// 			methods : {
// 				great : function(time) {
// 					return 'Jó ' + time + ' ' + this.name;
// 				}
// 			},
// 			mounted() {
// 				fetch("/")
// 					.then(response => response.json())
// 					.then((data) => {
// 						this.questions = data;
// 					})
// 			}
// 		})