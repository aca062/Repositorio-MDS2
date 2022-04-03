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
<vaadin-horizontal-layout class="content" style="align-items: center; width: 100%; height: 200px; padding: var(--lumo-space-s);" id="vaadinHorizontalLayout">
 <vaadin-button id="vaadinButton" style="margin: var(--lumo-space-s); background-image:url('https://i.scdn.co/image/ab67616d0000b273005ee342f4eef2cc6e8436ab'); background-repeat:no-repeat; background-size: 150px 150px; background-position:center; width: 150px; height: 150px; object-fit: contain;"></vaadin-button>
 <vaadin-vertical-layout style="align-items: flex-start; width: 30%; justify-content: center; align-self: center;" id="vaadinVerticalLayout">
  <h5 id="h5" style="padding: var(--lumo-space-s); width: 50%; align-self: flex-start;">120</h5>
  <h6>252.146.850</h6>
 </vaadin-vertical-layout>
 <vaadin-button style="background-image:url('https://e7.pngegg.com/pngimages/507/757/png-clipart-computer-icons-heart-like-button-like-share-comment-love-logo.png'); background-repeat:no-repeat;
        height:60px;
        width:30px;
        background-size: 60px 50px;
        background-position:center;
background-color: white;" src="" id="vaadinButton1"></vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
