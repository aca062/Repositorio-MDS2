import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cancion')
export class VistaCancion extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout class="content" style="align-items: baseline; width: 100%;" id="vaadinHorizontalLayout">
 <vaadin-button id="vaadinButton" style="margin: var(--lumo-space-s);background-image:url('https://i.scdn.co/image/ab67616d0000b273005ee342f4eef2cc6e8436ab'); background-repeat:no-repeat;
        height:100px;
        width:100px;
        background-size: 100px 100px;
        background-position:center;"></vaadin-button>
 <vaadin-vertical-layout style="align-items: flex-start; width: 50%;" id="vaadinVerticalLayout">
  <h5 id="h5" style="padding: var(--lumo-space-s); width: 50%; align-self: flex-start;">120</h5>
  <h5 style="width: 50%; padding: var(--lumo-space-s);" id="h51">252.146.850</h5>
 </vaadin-vertical-layout>
 <vaadin-button style="background-image:url('http://assets.stickpng.com/images/5a02bfca18e87004f1ca4395.png'); background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 60px 50px;
        background-position:center;" src="" id="vaadinButton1"></vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
