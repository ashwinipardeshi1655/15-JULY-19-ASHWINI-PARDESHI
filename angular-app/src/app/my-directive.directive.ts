import { Directive, ElementRef, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appMyDirective]'
})
export class MyDirectiveDirective {

  constructor(private elementRef : ElementRef) {
    elementRef.nativeElement.style.background = 'pink';
    elementRef.nativeElement.style.color = "white";
    elementRef.nativeElement.style.padding = '60px';
    elementRef.nativeElement.style.marginTop = "70px";
   }
// Host listener
  //  @HostListener('mouseenter')
  //  mouseEnter(){
  //    this.elementRef.nativeElement.style.background = 'red';
  //    this.elementRef.nativeElement.style.color = 'white';
  //  }
  // @HostListener('mouseleave')
  //  mouseLeave(){
  //  this.elementRef.nativeElement.style.background = 'green';
  //  this.elementRef.nativeElement.style.color = 'black';
//}


// host binding
@HostBinding('style.background') background:String;
@HostListener('mouseenter')
   mouseEntry(){
    this.background = 'purple';
   }
@HostListener('mouseleave')
   mouseExit(){
   this.background = 'blue';
   }}