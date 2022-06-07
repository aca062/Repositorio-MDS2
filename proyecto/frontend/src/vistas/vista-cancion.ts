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
<vaadin-horizontal-layout class="content" style="align-items: center; width: 100%; height: 200px; padding: var(--lumo-space-s); padding-top: 0;" id="layoutPrincipal">
 <vaadin-button id="botonCancion" style="margin: var(--lumo-space-s); background-repeat:no-repeat; background-size: 150px 150px; background-position:center; width: 150px; height: 150px; object-fit: contain;"></vaadin-button>
 <vaadin-vertical-layout style="align-items: flex-start; width: 30%; justify-content: center; align-self: center;" id="layoutCancion">
  <vaadin-button id="botonNombre">
    120 
  </vaadin-button>
  <h6 id="numeroRep">Heading 6</h6>
 </vaadin-vertical-layout>
 <vaadin-button style="background-image:url('https://e7.pngegg.com/pngimages/507/757/png-clipart-computer-icons-heart-like-button-like-share-comment-love-logo.png'); background-repeat:no-repeat;
        height:60px;
        width:30px;
        background-size: 60px 50px;
        background-position:center;
background-color: white;" src="" id="meGusta"></vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
